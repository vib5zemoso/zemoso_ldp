const CheckB = ({ type = "checkbox", text, ids }) => {
  return (
    <div>
      <input type={type} id={ids} name={ids} value={text} />
      <label for={ids}>{text}</label>
    </div>
  );
};
export default CheckB;
