import React, { useEffect, useState } from 'react'
import { createTechnicaldepartment, getTechnicaldepartmentById, updateTechnicaldepartment } from '../services/TechnicalDepartmentService';
import { useNavigate, useParams} from 'react-router-dom';



const TechnicaldepartmentComponent = () => {

const [tdegreename, setTdegreename] = useState('');

const{id} = useParams();

const navigator = useNavigate();

useEffect( () =>
 {
  
  getTechnicaldepartmentById(id).then((response) => {
     setTdegreename(response.data.tdegreename);
     })
     .catch(error => {
  console.error(error);
})
}, [id])

function saveOrupdateTechnicaldepartment(e)
{
  e.preventDefault();


  // if(validateForm()){
  // const technicaldepartment ={tdegreename}
  // console.log(technicaldepartment);

  const technicaldepartment = {tdegreename}
  console.log(technicaldepartment);
  
  if(id)
  {
updateTechnicaldepartment(id, technicaldepartment).then((response) => {
  console.log(response.data);
navigator('/technicaldepartment');
}).catch((error) => {
  console.error(error);
})
   } 


  else
  {
    createTechnicaldepartment(technicaldepartment).then((response) => {
      console.log(response.data);
    navigator('/technicaldepartment');
  }).catch((error) =>{
    console.error(error);
  })
  }
  
}




function pageTitle()
{
  if(id)
  {
    return <h2 className='text-center'>Update Degree</h2>
  }
  else{
    return <h2 className='text-center'>Add Degree</h2>
  }
}









  return (
    <div className='container'>
      <br /><br />
      <div className='row'>
<div className='card col-md-6 offset-md-3 offset-md-3'style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)', backgroundColor: 'rgba(204, 235, 255, 0.8)' }}>
{

pageTitle()

}
<div className='card-body'>
  <form>
<div className='form-group mb-2'>
  <label className='form-label'>Enter Degree Name</label>
<input type='text' name='tdegreename' value={tdegreename} onChange={(e) => setTdegreename(e.target.value)} className='form-control'>


</input>

</div>

<button className='btn btn-outline-success mb-2' onClick={(e) => saveOrupdateTechnicaldepartment(e)}>Submit</button>
  </form>

</div>
</div>
      </div>

    </div>
  )
}

export default TechnicaldepartmentComponent;