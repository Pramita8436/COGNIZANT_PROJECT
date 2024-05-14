import React from 'react'
import { NavLink } from 'react-router-dom';
import RoleNav from './RoleNav';

export const HeaderComponent = () => {
  return (
    <div>
     <header>
        <nav className= 'navbar navbar-expand-lg'  style={{ backgroundColor: 'rgb(240, 174, 215)' }}>
<a className ="navbar-brand" href="https://www.education.net">National Technology University</a>
<div className="collapse navbar-collapse" id="navbarNavDropdown">
    <ul className="navbar-nav">
    <li className="nav-item ">
  <NavLink className= 'nav-link' to= '/'>Home</NavLink>
      </li>
      <li className="nav-item ">
  <NavLink className= 'nav-link' to= '/careers'>Careers</NavLink>
      </li>
      <li className="nav-item ">
  <NavLink className= 'nav-link' to= '/location'>Location</NavLink>
      </li>
    </ul>
    <RoleNav />
  </div>
        </nav>
     </header>

    </div>
  )
}
export default HeaderComponent;