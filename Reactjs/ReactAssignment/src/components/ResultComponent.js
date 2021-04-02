import React, {Component} from 'react';

class ResultComponent extends Component {


    render() {
        let {result} = this.props;
        return (
            <div className="result">
                <h1>{result}</h1>
            </div>
    )
        ;
    }
}


export default ResultComponent;