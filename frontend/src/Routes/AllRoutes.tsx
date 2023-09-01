import {Routes,Route} from 'react-router-dom'
import Home from '../Pages/Home'
import Course from '../Pages/Course'

const AllRoutes = () => {

    return (
        <Routes>
            <Route path='/' element={ <Home /> }/>
            <Route path='/course' element={ <Course /> }/>
        </Routes>
    )
}

export default AllRoutes