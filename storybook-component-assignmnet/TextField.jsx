const TextField = ({ type = "text", textdata, ids, ...rest }) => {
  return <input type={type} id={ids} value={textdata} {...rest} />;
};

export default TextField;
