import React from 'react';
import { Link } from 'react-router-dom';
import './App.css';
import test from './assets/test.png';
import { ReactComponent as Logo } from './assets/logo.svg';

class App extends React.Component {

  handleSubmit = () => {
    alert('done !!');
  }

  render() {
    return (
      <div class="flex justify-center items-center h-screen bg-cloud-blue">
        <div class="flex-col justify-center">

          {/* Icon and Text */}
          <div>
            <Link to='/'>
              <Logo class="w-12 md:w-24 lg:w-32 inline" />
              <img src={test} class="w-32 md:w-96 lg:w-200 inline" alt="Three apples with arrows pointing to them" />
            </Link>
          </div>

          {/* Slogan */}

          {/* Search Bar */}
          <div class="flex justify-center p-[10%]">
            <form onSubmit={this.handleSubmit} class="flex items-center">
              <label for="search" class="sr-only">Search</label>

              <div class="relative w-full">
                {/* Magnifying Glass Icon */}
                <div class="flex absolute inset-y-0 left-0 items-center pl-3 pointer-events-none">
                  <svg class="w-[65%] h-[65%] text-sea-blue" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
                </div>
                <input type="text" id="search" class="bg-cloud-blue border-2 border-sea-blue text-sea-blue text-md rounded-2xl block w-full pl-10 p-[3%]" placeholder="Search" required></input>
              </div>
              {/* <input type="search" placeholder="type something here!" /> */}
            </form>
          </div>

        </div>
      </div>
    );
  }
  // render() {
  //   return (
  //     <div class="flex justify-center h-screen bg-cloud-blue">
  //       <div >
  //         <Link to='/'>
  //           <Logo class="w-8 md:w-16 lg:w-24 inline-block" />
  //           {/* <br/> */}
  //           <img src={test} class="w-40 md:w-96 lg:w-96 inline-block" alt="Three apples with arrows pointing to them" />
  //           {/* <span>Nominare</span> */}
  //         </Link>
  //       </div>
  //       <div class="inline-block">
  //         <form onSubmit={this.handleSubmit}>
  //           <input type="text" placeholder="type something here!" />
  //         </form>
  //       </div>
  //     </div>
  //   );
  // }
}

export default App;
