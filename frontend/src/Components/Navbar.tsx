import {AiOutlineClose,AiOutlineMenu} from 'react-icons/ai';
import { useState } from 'react';
import { Link } from 'react-router-dom';
const links=[
    {to:"/", label:"Home"},
    {to:"/", label:"SignIn"},
    {to:"/", label:"About"},
]
const Navbar = () => {
    const [nav,setNav]=useState<boolean>(false)

    const handleNav=():void=>{
        setNav(!nav)
    }


return (
    <div className="flex justify-between items-center h-24 max-w-[1240px] mx-auto px-4 text-black">
        <Link to={`/`}>
        <h1 className="w-full text-3xl font-bold text-[#5d8de9]">Mind Mesh</h1>
        </Link>
        <ul className="hidden md:flex">
            {
                links.map((el,ind)=>(
                    <Link to={"/"}>
                    <li className='p-4' key={ind}>{el.label}</li>
                    </Link>
                ))
            }
            <Link to={`/course`}>
            <button className="bg-[#5d8de9] w-[200px] rounded-md font-medium my-2 mx-auto py-2 hover:bg-[#28d5d2]">Get Started</button>
            </Link>
        </ul>
        <div onClick={handleNav} className='block md:hidden'>
            { nav ? <AiOutlineClose size={20}/>:<AiOutlineMenu size={20}/>}
        </div>
        <div className={nav ? "fixed left-0 top-0 w-[60%] h-full border-r border-r-gray-500 bg-gray-100 ease-in-out duration-500 z-10":'fixed ease-in-out duration-500 left-[-100%]'}>
        <h1 className="w-full text-3xl font-bold text-[#5d8de9] m-4">Mind Mesh</h1>
            <ul className="uppercase p-4">
            {/* <li className="p-4 border-b border-gray-600">home</li> */}
            {
                links.map((el,ind)=>(
                    <Link to={"/"}>
                    <li className="p-4 border-b border-gray-600" key={ind}>{el.label}</li>
                    </Link>
                ))
            }
            <Link to={`/course`}>
            <button className="bg-[#5d8de9] w-[200px] rounded-md font-medium my-2 mx-auto py-2 hover:bg-[#28d5d2]">Get Started</button>
            </Link>
            </ul>
        </div>
    </div>
)
}

export default Navbar