import "./App.css";
import Footer from "./Components/Footer";
import Navbar from "./Components/Navbar";
import AllRoutes from "./Routes/AllRoutes";

function App() {
  return (
    <div className="bg-gray-200">
      <Navbar />
      <AllRoutes />
      <Footer />
    </div>
  );
}

export default App;
