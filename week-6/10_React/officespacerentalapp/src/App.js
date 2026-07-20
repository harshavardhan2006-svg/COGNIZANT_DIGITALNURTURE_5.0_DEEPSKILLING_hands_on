import "./App.css";

function App() {

  const offices = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "/office.jpg"
    },

    {
      Name: "Infosys",
      Rent: 75000,
      Address: "Hyderabad",
      Image: "/office.jpg"
    },

    {
      Name: "Google",
      Rent: 90000,
      Address: "Bangalore",
      Image: "/office.jpg"
    }

  ];

  return (

    <div className="App">

      <h1>Office Space , at Affordable Range</h1>

      {

        offices.map((office, index) => (

          <div key={index} className="card">

            <img
              src={office.Image}
              alt="Office Space"
              width="300"
              height="200"
            />

            <h2>Name : {office.Name}</h2>

            <h3
              style={{
                color:
                  office.Rent <= 60000
                    ? "red"
                    : "green"
              }}
            >
              Rent Rs. {office.Rent}
            </h3>

            <h3>
              Address : {office.Address}
            </h3>

            <hr />

          </div>

        ))

      }

    </div>

  );

}

export default App;