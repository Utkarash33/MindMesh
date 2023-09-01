
const Course = () => {


  return (
    <div className="max-w-[80%] mt-[-96px] w-full h-screen mx-auto text-center flex flex-col justify-center">
       <p className="font-bold p-2 ">TO START WITH THE INTERVIEW</p>
    <h1 className="text-3xl md:text-4xl font-bold mb-8">Select Your Role</h1>
    <div className="grid gap-12 md:grid-cols-3">
      <div className="bg-[#5d8de9] rounded-lg p-6 shadow-md transform hover:bg-[#18a9eb] transition ease-in-out delay-150 hover:-translate-y-1 hover:scale-110 duration-300">
        <h2 className="text-xl text-white font-medium mb-2">NODE</h2>
        <p className="text-white">For the Role of a NODE Backend Developer</p>
      </div>
      <div className="bg-[#5d8de9] rounded-lg p-6 shadow-md transform hover:bg-[#18a9eb] transition ease-in-out delay-150 hover:-translate-y-1 hover:scale-110 duration-300">
        <h2 className="text-xl text-white font-medium mb-2">JAVA</h2>
        <p className="text-white">For the Role of a JAVA Backend Developer</p>
      </div>
      <div className="bg-[#5d8de9] rounded-lg p-6 shadow-md transform hover:bg-[#18a9eb] transition ease-in-out delay-150 hover:-translate-y-1 hover:scale-110 duration-300">
        <h2 className="text-xl text-white font-medium mb-2">MERN</h2>
        <p className="text-white">For the Role of a MERN Stack Developer</p>
      </div>
    </div>
  </div>
  )
}

export default Course