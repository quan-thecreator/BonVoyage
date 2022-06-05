import { React, useState } from 'react';
import { Link } from 'react-router-dom';
import './App.css';
import test from './assets/test.png';
import { ReactComponent as Logo } from './assets/logo.svg';
import axios from 'axios';

axios.interceptors.request.use(request => {
  console.log('Starting Request', JSON.stringify(request, null, 2))
  return request
})

axios.interceptors.response.use(response => {
  console.log('Response:', JSON.stringify(response, null, 2))
  return response
})

const App = () => {

  const [search, setSearch] = useState('');

  const handleSubmit = (e) => {
    axios.get(`http://nominare.study:8080/summary?topic=${search}`, {
      headers: {'Access-Control-Allow-Origin': '*'}
    })
      .then((res) => {
        console.log(res)
      }).catch((err) => {
        console.log(err)
      })
    e.preventDefault()
    // await axios.get(`http://nominare.study:8080/videos?topic=${search}`)
    // await axios.get(`http://nominare.study:8080/link?topic=${search}`)

    // summary.then((res) =>
    //   alert(res)
    // )
  }

  return (
    <div>
      <div class="flex justify-center items-center h-screen bg-cloud-blue">
        <div class="flex-col justify-center">

          {/* Icon and Text */}
          <div>
            {/* <Link to='/'> */}
              <Logo class="w-12 md:w-24 lg:w-32 inline" />
              <img src={test} class="w-32 md:w-96 lg:w-200 inline" alt="Three apples with arrows pointing to them" />
            {/* </Link> */}
          </div>

          {/* Slogan */}

          {/* Search Bar */}
          <div class="flex justify-center p-[10%]">
            <form onSubmit={handleSubmit} class="flex items-center">
              <label for="search" class="sr-only">Search</label>

              <div class="relative w-full">
                {/* Magnifying Glass Icon */}
                <div class="flex absolute inset-y-0 left-0 items-center pl-3 pointer-events-none">
                  <svg class="w-[65%] h-[65%] text-sea-blue" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
                </div>
                <input onChange={(e) => setSearch(e.target.value)} type="text" id="search" class="bg-cloud-blue border-2 border-sea-blue text-sea-blue text-md rounded-2xl block w-full pl-10 p-[3%]" placeholder="Search" required></input>
              </div>
              {/* <input type="search" placeholder="type something here!" /> */}
            </form>
          </div>

        </div>
      </div>
    </div>
  );
}

export default App;
