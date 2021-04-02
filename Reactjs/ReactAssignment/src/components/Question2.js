import React from 'react'
import Pe from './person'
import d from './data/data.json'
function nameList() {

    const aa = d.map(x => (<Pe key={x.id} p={x} />))
    const mystyle = {
        width: "70%"
    }
    return (
        <table style={mystyle}>
            <tr>
                <th>Name</th>
                <th>Job</th>
            </tr>
            {aa}
        </table>
    )
}

export default nameList
