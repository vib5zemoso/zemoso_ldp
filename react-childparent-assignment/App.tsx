import * as React from "react";
import Box from "@mui/material/Box";
import IconButton from "@mui/material/IconButton";
import OutlinedInput from "@mui/material/OutlinedInput";
import InputAdornment from "@mui/material/InputAdornment";
import FormHelperText from "@mui/material/FormHelperText";
import FormControl from "@mui/material/FormControl";
import Visibility from "@mui/icons-material/Visibility";
import VisibilityOff from "@mui/icons-material/VisibilityOff";
import FormControlLabel from "@mui/material/FormControlLabel";
import Checkbox from "@mui/material/Checkbox";
import Button from "@mui/material/Button";
import { Typography } from "@material-ui/core";
import GitHubIcon from "@material-ui/icons/GitHub";
import GoogleIcon from "@mui/icons-material/Google";
export default function App() {
  const [showPassword, setShowPassword] = React.useState(false);

  const handleClickShowPassword = () => setShowPassword((show) => !show);

  const handleMouseDownPassword = (
    event: React.MouseEvent<HTMLButtonElement>
  ) => {
    event.preventDefault();
  };
  return (
    <Box
      sx={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        p: 1,
        m: 1,
        bgcolor: "background.paper",
        border: 1,
        borderRadius: 1,
        width: "100vw",
        height: "100vh",
      }}
    >
      <Box sx={{ width: "30vw", height: "80vh" }}>
        <Typography variant="h4">Sign in</Typography> <br />
        <Typography variant="subtitle1">
          Please enter login credentials
        </Typography>
        <FormControl sx={{ width: "25vw", mt: 1 }} variant="outlined">
          <FormHelperText id="outlined-email-helper-text">Email</FormHelperText>
          <OutlinedInput
            id="outlined-adornment-email"
            placeholder="abc@gmail.com"
            aria-describedby="outlined-email-helper-text"
            inputProps={{
              "aria-label": "email",
            }}
          />
        </FormControl>
        <FormControl sx={{ width: "25vw", mt: 1, mb: 1 }} variant="outlined">
          <FormHelperText id="outlined-password-helper-text">
            Password
          </FormHelperText>
          <OutlinedInput
            id="outlined-adornment-password"
            placeholder="********"
            type={showPassword ? "text" : "password"}
            endAdornment={
              <InputAdornment position="end">
                <IconButton
                  aria-label="toggle password visibility"
                  onClick={handleClickShowPassword}
                  onMouseDown={handleMouseDownPassword}
                  edge="end"
                >
                  {showPassword ? <VisibilityOff /> : <Visibility />}
                </IconButton>
              </InputAdornment>
            }
          />
        </FormControl>
        <Box
          sx={{
            display: "flex",
            justifyContent: "space-between",
            bgcolor: "background.paper",
            borderRadius: 1,
            width: "25vw",
          }}
        >
          <FormControlLabel control={<Checkbox />} label="Remember Me" />
          <Button variant="text">Forgot Password?</Button>
        </Box>
        <Box>
          <Button
            variant="contained"
            sx={{ width: "25vw", p: 1, mt: 1, mb: 1, bgcolor: "BlueViolet" }}
          >
            Sign In
          </Button>
          <center>
            <Typography variant="subtitle2">Or</Typography>
          </center>
          <Button
            variant="outlined"
            startIcon={<GoogleIcon />}
            sx={{
              width: "25vw",
              p: 1,
              mt: 1,
              color: "black",
              borderColor: "black",
            }}
          >
            Sign In with Google
          </Button>
          <Button
            variant="outlined"
            startIcon={<GitHubIcon />}
            sx={{
              width: "25vw",
              p: 1,
              mt: 1,
              color: "black",
              borderColor: "black",
            }}
          >
            Sign In with Github
          </Button>
        </Box>
        <Box
          sx={{
            display: "flex",
            justifyContent: "center",
            bgcolor: "background.paper",
            mt: 1,
          }}
        >
          <Typography variant="subtitle2">Don't Have an account</Typography>
          <Button variant="text" sx={{ padding: "0px" }}>
            Sign up?
          </Button>
        </Box>
      </Box>
    </Box>
  );
}
