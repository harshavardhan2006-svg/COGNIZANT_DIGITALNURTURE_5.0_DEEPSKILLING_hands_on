import React, { Component } from "react";

class Counter extends Component {

    constructor() {
        super();

        this.state = {
            count: 5
        };
    }

    increment = () => {

        this.setState({
            count: this.state.count + 1
        });

    }

    decrement = () => {

        this.setState({
            count: this.state.count - 1
        });

    }

    sayHello = () => {

        alert("Hello! Member");

    }

    sayWelcome = (msg) => {

        alert(msg);

    }

    clickMe = () => {

        alert("I was clicked");

    }

    handleIncrement = () => {

        this.increment();

        this.sayHello();

    }

    render() {

        return (

            <div>

                <h2>{this.state.count}</h2>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <br /><br />

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button
                    onClick={() => this.sayWelcome("Welcome")}
                >
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.clickMe}>
                    Click on me
                </button>

            </div>

        );

    }

}

export default Counter;