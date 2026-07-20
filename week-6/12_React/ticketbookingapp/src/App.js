import React, { Component } from "react";

/* Guest Page */

function GuestGreeting() {
  return (
    <div>
      <h2>Flight Details</h2>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI-202</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>10:30 AM</td>
          </tr>

          <tr>
            <td>6E-501</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>2:00 PM</td>
          </tr>
        </tbody>
      </table>

      <br />

      <h3>Please Login to Book Tickets.</h3>
    </div>
  );
}

/* User Page */

function UserGreeting() {
  return (
    <div>
      <h2>Welcome Back</h2>

      <h3>You can now book your tickets.</h3>

      <button>Book Ticket</button>
    </div>
  );
}

/* Greeting Component */

function Greeting(props) {

  if (props.isLoggedIn) {

    return <UserGreeting />;

  }

  return <GuestGreeting />;
}

/* Login Button */

function LoginButton(props) {

  return (

    <button onClick={props.onClick}>

      Login

    </button>

  );

}

/* Logout Button */

function LogoutButton(props) {

  return (

    <button onClick={props.onClick}>

      Logout

    </button>

  );

}

/* Main Component */

class App extends Component {

  constructor(props) {

    super(props);

    this.state = {

      isLoggedIn: false

    };

  }

  loginClick = () => {

    this.setState({

      isLoggedIn: true

    });

  };

  logoutClick = () => {

    this.setState({

      isLoggedIn: false

    });

  };

  render() {

    let button;

    if (this.state.isLoggedIn) {

      button = (

        <LogoutButton

          onClick={this.logoutClick}

        />

      );

    }

    else {

      button = (

        <LoginButton

          onClick={this.loginClick}

        />

      );

    }

    return (

      <div style={{ margin: "40px" }}>

        <Greeting

          isLoggedIn={this.state.isLoggedIn}

        />

        <br />

        {button}

      </div>

    );

  }

}

export default App;