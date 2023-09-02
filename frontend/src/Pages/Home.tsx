import { Link } from "react-router-dom"
const Home = () => {
  return (
    <div>
        <div className="max-w-[800px] mt-[-96px] w-full h-[82vh] mx-auto text-center px-6 flex flex-col justify-center">
            <p className="font-bold p-2 ">START WITH YOUR INTERVIEW PREPARATION </p>
            <h1 className="text-[#5d8de9] md:text-5xl sm:text-4xl text-3xl font-bold md:py-6">ACE YOUR INTERVIEWS</h1>
                <p className="md:text-3xl sm:text-2xl text-xl font-medium">Practice your interview for <span className="text-[#5d8de9]">Node</span> <span className="text-[#5d8de9]">Java</span> and <span className="text-[#5d8de9]">MERN</span></p>
                <p className='md:text-2xl sm:text-xl text-lg font-bold text-gray-500'>Practice your technical interview and get valuable feedback to improve</p>
                <Link to={`/role`}>
                <button className="bg-[#5d8de9] w-[200px] rounded-md font-medium my-6 mx-auto py-3 hover:bg-[#28d5d2]">Get Started</button>
                </Link>
        </div>
    </div>
  )
}

export default Home