import React from 'react';
import { Link } from 'react-router-dom';
import './App.css';
import './assets/logo.png';

class App extends React.Component {

  handleSubmit = () => {
    alert('done !!');
  }

  render() {
    return (
      <div className="container">
        <div className="title">
          <Link to='/'>
            <span>Nominare</span>
          </Link>
        </div>
        <div className="search">
          <form className="search-box" onSubmit={this.handleSubmit}>
            <input type="text" className="search-input" placeholder="type something here!" />
          </form>
        </div>
      </div>
    );
  }
}

export default App;
