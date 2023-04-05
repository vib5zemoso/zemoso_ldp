const DropDown = () => {
  const options = ["One", "Two", "Three", "Four", "Five"];
  const onOptionChangeHandler = (event) => {
    console.log("User Selected Value - ", event.target.value);
  };
  return (
    <>
      <center>
        <select onChange={onOptionChangeHandler}>
          <option>Please choose one option</option>
          {options.map((option, index) => {
            return <option key={index}>{option}</option>;
          })}
        </select>
      </center>
    </>
  );
};

export default DropDown;
