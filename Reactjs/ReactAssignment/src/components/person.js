import React from 'react'

function person({ p }) {

    return (
        <tr>
            <td>{p.name}</td>
            <td>{p.job}</td>
        </tr>
    )
}

export default person