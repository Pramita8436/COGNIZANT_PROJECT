import React from 'react'

const LocationComponents = () => {
  return (
    <div className="container">
    <div className="row">
    <div className="col-md-6">
          <img src="https://cdn2.vectorstock.com/i/1000x1000/49/71/india-map-pin-location-vector-47084971.jpg"/>
        </div>
        <div className="col-md-6">
        <h1 className="display-4 text-center my-5"  style={{ color: '#ff6347', textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)' }}>Visit Our Campus in India!</h1>
        <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)' }}>
       </div>


       <div className="col-md-6">
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)', position: 'absolute', top: 450, left: 600, backgroundColor: 'rgba(204, 235, 255, 0.8)'}}>
            <div className="card-body">
              <h5 className="card-title">NOW AT METROS!</h5>
              <p className="card-text">Folks be ready! Delhi, Kolkata and Mumbai. We are at your footstep</p>
              <button type="button" className="btn btn-primary" aria-label="Learn More">Find Us</button>
            </div>
          </div>
        </div>


       <div className="col-md-6">
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)', position: 'absolute', bottom: -350, right: 650 , backgroundColor: 'rgba(204, 235, 255, 0.8)'}}>
            <div className="card-body">
              <h5 className="card-title">ACCOMMODATION</h5>
              <p className="card-text">Providing accommodation to students, faculties and staffs! Newly built hostels at every Campus!</p>
              <button type="button" className="btn btn-primary" aria-label="Learn More">Learn More</button>
            </div>
          </div>
        </div>
       </div>
       </div>
       </div>



    
  
  )
}

export default LocationComponents;