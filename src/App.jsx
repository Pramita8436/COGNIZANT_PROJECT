import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListStudentComponent from './components/ListStudentComponent'
import{BrowserRouter, Routes,Route} from 'react-router-dom'
import StudentComponent from './components/StudentComponent'
import ListTechnicaldepartmentComponent from './components/ListTechnicaldepartmentComponent'
import TechnicaldepartmentComponent from './components/TechnicaldepartmentComponent'
import HomepageComponenet from './components/HomepageComponenet'
import Register from './components/Register'
import Login from './components/Login'
import ViewStudentByUser from './components/ViewStudentByUser'
import ViewDegreeByUser from './components/ViewDegreeByUser'
import CareerComponent from './components/CareerComponent'
import LocationComponents from './components/LocationComponents'



function App() {
   return (
    <>
    <BrowserRouter>
    <HeaderComponent />
    <Routes>
      


      {/* // http://localhost:3000 */}
     <Route path='/' element = {<HomepageComponenet />}></Route>

     <Route path='/all' element = {<HomepageComponenet />}></Route>

     <Route path='/careers' element = {<CareerComponent />}></Route>

     <Route path='/location' element = {<LocationComponents />}></Route>


     {/* // http://localhost:3000/student */}
<Route path ='/student' element = { <ListStudentComponent />}></Route>


{/* // http://localhost:3000/addstudent */}
<Route path ='/addstudent' element = {<StudentComponent />}></Route>

 {/* //http://localhost:3000/user/register */}
     <Route path = '/user/register' element={<Register/>}></Route>

     <Route path = '/viewstudentbyuser' element={<ViewStudentByUser />}></Route>
     
     <Route path = '/viewdegreebyuser' element={<ViewDegreeByUser />}></Route>

     {/* //http://localhost:3000/user/login */}
     <Route path = '/user/login' element={<Login/>}></Route>

    {/* // http://localhost:3000/updatestudent/1 */}
    <Route path= '/updatestudent/:id' element ={ <StudentComponent />}></Route>

    {/* // http://localhost:3000/technicaldepartment */}
    <Route path='/technicaldepartment' element = { <ListTechnicaldepartmentComponent />}></Route>

<Route path='/addDegree' element= { <TechnicaldepartmentComponent />}></Route>


<Route path='/updatetechnicaldepartment/:id' element = { <TechnicaldepartmentComponent />}></Route>
    </Routes>
      <FooterComponent />
      </BrowserRouter>
    </>
  )
}

export default App;
