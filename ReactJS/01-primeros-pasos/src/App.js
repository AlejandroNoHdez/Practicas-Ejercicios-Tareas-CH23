import logo from './logo.svg';
import './App.css';
import PrimerComponente from './misComponentes/PrimerComponente';
import { SegundoComponente } from './misComponentes/SegundoComponente';
import TercerComponente from './misComponentes/TercerComponente';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Contacto from './pages/Contacto';

function App()
{
    const datos = {
        lugar: "Acapulco",
        gusto: "Motos Chopper c250 c5000"
    }

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <BrowserRouter>
                    <Routes>
                        <Route path="/" element={<div>Hola CH23</div>} >
                        </Route>
                        <Route path="/msj" element={<div>Generacion 2023</div>} ></Route>
                        <Route path="/contacto" element={<Contacto />} ></Route>
                    </Routes>
                </BrowserRouter>

                <p>
                    Hola Mundo! :) 🤑
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
                <h1>Cohorte 23</h1>
                <div className='componentes'>
                    <hr />
                    <TercerComponente />
                    <hr />
                    <SegundoComponente nombre="Octavio" apellido="Paz"
                        info={datos}
                    />
                    <hr />
                    <PrimerComponente />
                </div>
            </header>
        </div >
    );
}

export default App;
