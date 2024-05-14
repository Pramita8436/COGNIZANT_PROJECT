import React from 'react'

const CareerComponent = () => {
  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 order-md-2">
          <h1 className="display-4 text-center my-5"  style={{ color: '#ff6347', textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)' }}>Build Your Career With Us!</h1>
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)' , backgroundColor: 'rgba(247, 220, 111, 0.5)' }}>
            <div className="card-body">
              <h5 className="card-title">BE A MENTOR!</h5>
              <p className="card-text">Becoming a mentor is about guiding others towards their full potential. It’s a journey of shared wisdom, fostering growth, and lighting the path to success</p>
              <button type="button" className="btn btn-primary">Learn More</button>
            </div>
          </div>
        </div>
        <div className="col-md-6 order-md-1">
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)', backgroundColor: 'rgba(204, 235, 255, 0.8)', color:'black' }}>
            <div className="card-body">
              <h5 className="card-title">CAREER EVENTS</h5>
              <p className="card-text">Announcing career fairs, networking events, guest lectures, and workshops</p>
              <button type="button" className="btn btn-primary">Join Us</button>
            </div>
          </div>
        </div>
        <div className="col-md-6 order-md-3">
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)',backgroundColor: 'rgba(255, 200, 200, 0.8)' }}>
            <div className="card-body">
              <h5 className="card-title">PARTNER @NTU</h5>
              <p className="card-text">Collaborate with us to drive innovation and create new opportunities for growth and development</p>
              <button type="button" className="btn btn-primary">Collaborate</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}

export default CareerComponent;