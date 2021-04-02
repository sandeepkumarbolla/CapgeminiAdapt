
import React, { Component } from 'react'
import axios from 'axios'
class postlist extends Component {
    constructor(props) {
        super(props)

        this.state = {
            posts:[],
            city:'London',
            country:'Uk',
            errorMsg: ''
        }
    }
    
    handler=(e) =>{
        this.setState({city:e.target.value})
    }
    handler1=(e) =>{
        this.setState({country:e.target.value})
    }
    getdata(a,b){
        axios.get(`http://api.openweathermap.org/data/2.5/weather?q=${a},${b}&APPID=e2a0894f88ad3eb47c6a9844d9e14421`)
      //axios.get(`http://api.openweathermap.org/data/2.5/forecast/daily?q=${a}&cnt=5&appid=e2a0894f88ad3eb47c6a9844d9e14421`)
            .then(res => {
                
                this.setState({ posts: res.data.main })
                //console.log(res)
                console.log(this.state.posts.temp)
            })
            .catch(error => {
                console.log(error) 
                this.setState({
                    errorMsg: 'error retreving data'
                })
            })
    }

    render() {
        const { posts, errorMsg,city,country } = this.state
        return (
            <div className={`b`}>
                <input type='text' value={city} onChange={this.handler}/>
                <input type='text' value={country} onChange={this.handler1}/>
                <button onClick={()=> this.getdata(city,country)}>weathr</button>
                {posts.temp}
                {errorMsg ? <div>{errorMsg}</div> : null}
            </div>
        )
    }
}

export default postlist

