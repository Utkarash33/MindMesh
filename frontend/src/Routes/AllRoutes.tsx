import {Routes,Route} from 'react-router-dom'
import Home from '../Pages/Home'
import Course from '../Pages/Course'
import Interview from '../Pages/Interview'

const AllRoutes = () => {

    return (
        <Routes>
            <Route path='/' element={ <Home /> }/>
            <Route path='/role' element={ <Course /> }/>
            <Route path='/role/:track' element={ <Interview /> }/>
        </Routes>
    )
}

export default AllRoutes