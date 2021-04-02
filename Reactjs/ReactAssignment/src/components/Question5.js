import React, { Component } from 'react'
import './style.css';

export class Time extends Component {
    constructor(props) {
        super(props)
        const today = new Date()
        const time = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
        const date = today.getFullYear() + '-' + today.getMonth() + '-' + today.getDate()
        this.state = {
            cd: date,
            ct: time
        }
    }
    componentWillMount() {
        this.intervalID = setInterval(() => this.updateTime(), 1000);
    }

    updateTime() {
        const today = new Date()
        const time = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
        const date = today.getFullYear() + '-' + today.getMonth() + '-' + today.getDate()
        const cb = document.getElementById('accept');
        this.setState({
            cd: time,
            ct: cb.checked ? date : ''
        })
    }
    render() {
    
        return (
            <div >
                <h1>Digital clock</h1>
                <span class="dot">{this.state.cd}<br />{this.state.ct}</span><br/><br/>
                <label class="switch">
                    <input type="checkbox" id="accept"></input>
                    <span class="slider round"></span>
                </label>

            </div>
        )
    }
}
// value="B" onChange={this.handleTopicChange} 
export default Time
