import { Link } from 'react-router-dom';
import './App.css';

export default function App() {
  return (
    <div className="container">
      <div className="title">
        <Link to='/'>
          <span>Nominare</span>
        </Link>
      </div>
      <div className="search">
        <form className="search-box" onSubmit="return submit()">
          <input type="text" className="search-input" placeholder="Learn something new :)" />
        </form>
      </div>
    </div>
  );
}
function submit() {
  alert('done !!');
}
