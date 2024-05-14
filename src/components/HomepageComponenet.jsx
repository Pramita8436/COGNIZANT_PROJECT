import React from 'react'


const HomepageComponenet = () => {
  return (
<div className="container">
      <div className="row">
      <div className="col-md-6">
            <img src="https://c0.wallpaperflare.com/preview/416/179/610/kings-college-cambridge-uk-university.jpg"/>
          </div>
          <div className="col-md-6">
          <h1 className="display-4 text-center my-5"  style={{ color: '#ff6347', textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)' }}>NTU invites you!</h1>
          <div className="card" style={{ backgroundColor: 'rgba(255, 255, 255, 0.8)' }}>
            <div className="card-body">
              <h5 className="card-title">STUDY @NTU</h5>
              <p className="card-text">Towards a Global Knowledge Hub, striving continuously in pursuit of excellence in Education, Research, Entrepreneurship and Technological services to the society</p>
              <button type="button" className="btn btn-primary">Learn More</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}
export default HomepageComponenet;












