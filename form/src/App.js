import logo from './logo.svg';
import './App.css';
const handleInput = (e) => {
  e.preventDefault();
  alert("Form Submitted Check Console");
  console.log(e.target.firstname.value);
  console.log(e.target.lastname.value);
  console.log(e.target.npi.value);
  console.log(e.target.address.value);
  console.log(e.target.phone.value);
  console.log(e.target.email.value);
}

function RenderForm() {
  return (
    <form onSubmit={handleInput}>
      <input type="text" placeholder="First Name" name="firstname"></input><br />
      <input type="text" placeholder="Last Name" name="lastname"></input><br />
      <input type="text" placeholder="NPI Number" name="npi"></input><br />
      <input type="text" placeholder="Address" name="address"></input><br />
      <input type="tel" placeholder="Telephone Number" name="phone"></input><br />
      <input type="email" placeholder="Email" name="email"></input><br />
      <input type="submit" value="Submit"></input>
    </form>
  )
}

function App() {
  return (
    <>
      <h1>A simple form</h1>
      <RenderForm></RenderForm>
    </>
  );
}


export default App;
