import "./TextAreas.css";

const TextAreas = ({ type = "textarea", textdata }) => {
  return (
    <textarea type={type} className="textarea-style">
      {textdata}
    </textarea>
  );
};

export default TextAreas;
