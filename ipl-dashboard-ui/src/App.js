import "./App.css";
import Footer from "./components/Footer";
import Header from "./components/Header";
import Main from "./components/Main";
import SideBar from "./components/SideBar";

function App() {
  return (
    <>
      <div className="container">
        <Header />
        <SideBar />
        <Main />
        <Footer />
      </div>
    </>
  );
}

export default App;
