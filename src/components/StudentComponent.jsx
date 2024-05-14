import React, { useEffect, useState } from 'react'
import { createStudent, getStudent, updateStudent } from '../services/StudentService'
import {useNavigate, useParams} from 'react-router-dom';
import { getAllTechnicaldepartment } from '../services/TechnicalDepartmentService';


const StudentComponent = () => {

 const [firstname, setFirstname] = useState('')
 const [lastname, setLastname] = useState('')
 const [email, setEmail] = useState('')
 const[degreeid, setDegreeid] = useState('')
 const [technicalDepartment,setTechnicalDepartment] = useState([])

 
useEffect(() => {
  getAllTechnicaldepartment().then((response) =>{
    setTechnicalDepartment(response.data);
  }).catch(error => {
    console.error(error);
  })

},
[])

 const {id} = useParams();


 const [errors, setErrors] = useState({
  firstname:'',
  lastname:'',
  email:'',
technicaldepartment:''})


const navigator = useNavigate();



useEffect(()=>
{
if(id)

{
  getStudent(id).then((response) => {
    setFirstname(response.data.firstname);
    setLastname(response.data.lastname);
    setEmail(response.data.email);
    setDegreeid(response.data.degreeid);
  })
  .catch(error => {
    console.error(error);})
}}, [id])


function saveOrupdateStudent(e)
{
e.preventDefault();

if(validateForm()){
const student ={firstname, lastname, email, degreeid}
  console.log(student)

 if(id)
  {
updateStudent(id ,student).then((response) => {console.log(response.data);
  navigator('/student');
})
.catch(error => {console.error(error);})
  }


  else{

    createStudent(student).then((response) => {console.log(response.data);
      navigator('/student')})
.catch(error => {console.error(error);});
  }
}
}


function validateForm(){
let valid = true;

const errorsCopy = {... errors}

if(firstname.trim()){
  errorsCopy.firstname = '';
}
else{
  errorsCopy.firstname = 'It is a mandatory field';
  valid = false;
}
if(email.trim()){
errorsCopy.email = '';
}
else
{
  errorsCopy.email = "It is a mandatory field";
  valid= false;
}

if(degreeid){
  errorsCopy.technicaldepartment = ''
}
else{
  errorsCopy.technicaldepartment = "Please choose degree";
  valid = false;
}

setErrors(errorsCopy);
return valid;

}

function pageTitle(){
 if(id){
  return <h2 className='text-center'>Edit Student Credential</h2>
 }
 else{
  return <h2 className='text-center'>Add Student Credential</h2>
 }
}

  return (
    <div className='container'>
      <br /> <br />
      <div className='row'>
        <div className='card col-md-6 offset-md-3 offset-md-3' style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)' ,backgroundColor: 'rgba(255, 200, 200, 0.8)'}}>
{
  pageTitle()
}
<div className='card-body'>
  <form>
   <div className='form-group mb-2'>
<label className='form-label'>Enter First Name:</label>
<input
type='text'
// placeholder='First Name'
name='firstname'
value={firstname}
className ={`form-control ${ errors.firstname ? 'is-invalid': ''}`}
onChange={(e) => setFirstname(e.target.value)}
>
</input>
{errors.firstname && <div className='invalid-feedback'>{errors.firstname} </div>}
    </div> 
    <div className='form-group mb-2'>
<label className='form-label'>Enter Last Name:</label>
<input
type='text'
// placeholder='Last Name'
name='lastname'
value={lastname}
className ='form-control'
onChange= {(e) => setLastname(e.target.value)}
>
</input>
    </div>

     
    <div className='form-group mb-2'>
<label className='form-label'>Enter Email:</label>
<input
type='text'
// placeholder='Email'
name='email'
value={email}
className ={`form-control ${errors.email ? 'is-invalid': ''}`}
onChange= {(e) => setEmail(e.target.value)}
>
</input>
{errors.email && <div className='invalid-feedback'>{errors.email} </div>}
    </div>



    <div className='form-group mb-2'>
<label className='form-label'>Choice of Technical Degree:</label>
<select
className ={`form-control ${errors.technicaldepartment ? 'is-invalid': ''}`}
value={degreeid}
onChange={(e) => setDegreeid(e.target.value)}
>

  <option value ="Choice of Technical Degree"></option>
   {
    technicalDepartment.map(technicaldepartment =>
       <option key={technicaldepartment.tdegreeid} value={technicaldepartment.tdegreeid}> {technicaldepartment.tdegreename}</option> )
   }

</select>
{errors.technicaldepartment && <div className='invalid-feedback'>{errors.technicaldepartment} </div>}
    </div>
    



    <button className='btn btn-outline-success' onClick={saveOrupdateStudent}>Submit</button>
  </form>

</div>
        </div>
      </div>



    </div>
  )
}

export default StudentComponent;