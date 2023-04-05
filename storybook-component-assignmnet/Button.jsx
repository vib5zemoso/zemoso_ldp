import "./Button.css";

const Button = ({ type = "button", onClick, label, ...rest }) => {
  return (
    <button type={type} onClick={onClick} {...rest} className="button-style">
      {label}
    </button>
  );
};
export default Button;
