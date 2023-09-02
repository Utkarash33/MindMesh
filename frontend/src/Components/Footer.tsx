
const Footer = () => {
    return (
        <footer className="bg-[#5d8de9] text-white py-4">
          <div className="container mx-auto flex flex-col items-center justify-center">
            <div className="text-2xl font-semibold mb-4">Mind Mesh</div>
            <ul className="flex space-x-4">
              <li><a href="#">Home</a></li>
              <li><a href="#">About Us</a></li>
              <li><a href="#">Services</a></li>
              <li><a href="#">Contact</a></li>
            </ul>
            <div className="mt-2">
              <p>&copy; {new Date().getFullYear()} Mind Mesh</p>
            </div>
          </div>
        </footer>
      );
    };
    
    export default Footer;