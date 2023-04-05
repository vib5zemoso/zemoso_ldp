import * as React from "react";
import Paper from "@mui/material/Paper";
import Table from "@mui/material/Table";
import TableBody from "@mui/material/TableBody";
import TableCell from "@mui/material/TableCell";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TablePagination from "@mui/material/TablePagination";
import TableRow from "@mui/material/TableRow";
import Checkbox from "@mui/material/Checkbox";
import { Select } from "@mui/material";
import MenuItem from "@material-ui/core/MenuItem";
import { useState, useEffect } from "react";
import Menu from "@mui/material/Menu";
import Button from "@mui/material/Button";
function createData(
  name: string,
  adjudiction: string,
  status: string,
  location: string,
  date: string
) {
  return { name, adjudiction, status, location, date };
}

const rows = [
  createData("nak gue", "Engaged", "CLEAR", "London", "6/12/2023"),
  createData(
    "jim reat",
    "Pre Adverse Action",
    "CLEAR",
    "new york",
    "6/12/2023"
  ),
  createData("col fam", "Engaged", "CONSIDER", "LA", "6/12/2023"),
  createData(
    "hillary pit",
    "Pre Adverse Action",
    "CLEAR",
    "London",
    "6/12/2023"
  ),
  createData(
    "tom cruse",
    "Pre Adverse Action",
    "CLEAR",
    "new york",
    "6/12/2023"
  ),
  createData("JOhn smith", "Engaged", "CONSIDER", "seattle", "6/12/2023"),
  createData("holy hearther", "Engaged", "CONSIDER", "florida", "6/12/2023"),
  createData(
    "dan mark",
    "Pre Adverse Action",
    "CLEAR",
    "california",
    "6/12/2023"
  ),
  createData("kelly r", "Engaged", "CLEAR", "new jersey", "6/12/2023"),
  createData(
    "mark cuban",
    "Pre Adverse Action",
    "CONSIDER",
    "texas",
    "6/12/2023"
  ),
];

export default function App() {
  const [filteredData, setFilteredData] = useState(rows);
  const [stat, setStat] = useState("All");

  const [open, setOpen] = useState(false);
  const anchorRef = React.useRef<HTMLButtonElement>(null);

  useEffect(() => {
    console.log(stat);
    if (stat === "All" || stat === "All2") {
      setFilteredData(rows);
    } else if (stat === "CLEAR" || stat === "CONSIDER") {
      setFilteredData(rows.filter((dt) => dt.status === stat));
    } else {
      setFilteredData(rows.filter((dt) => dt.adjudiction === stat));
    }
  }, [stat]);

  function handleListKeyDown(event: React.KeyboardEvent) {
    if (event.key === "Tab") {
      event.preventDefault();
      setOpen(false);
    } else if (event.key === "Escape") {
      setOpen(false);
    }
  }

  const [anchorEl, setAnchorEl] = React.useState<null | HTMLElement>(null);
  const handleClick = (event: React.MouseEvent<HTMLElement>) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  // return focus to the button when we transitioned from !open -> open
  const prevOpen = React.useRef(open);
  React.useEffect(() => {
    if (prevOpen.current === true && open === false) {
      anchorRef.current!.focus();
    }

    prevOpen.current = open;
  }, [open]);

  //divide..............................................................................................

  const [page, setPage] = React.useState(0);
  const [rowsPerPage, setRowsPerPage] = React.useState(10);

  const handleChangePage = (event: unknown, newPage: number) => {
    setPage(newPage);
  };

  const handleChangeRowsPerPage = (
    event: React.ChangeEvent<HTMLInputElement>
  ) => {
    setRowsPerPage(+event.target.value);
    setPage(0);
  };

  return (
    <div>
      <div>
        <Button
          id="demo-positioned-button"
          aria-controls={open ? "demo-positioned-menu" : undefined}
          aria-haspopup="true"
          aria-expanded={open ? "true" : undefined}
          onClick={handleClick}
        >
          <Button
            variant="outlined"
            style={{ borderColor: "#E5E7ED", color: "black", margin: "10px" }}
          >
            Filter
          </Button>
        </Button>
        <Menu
          id="demo-positioned-menu"
          anchorEl={anchorEl}
          open={Boolean(anchorEl)}
          onClose={handleClose}
          onKeyDown={handleListKeyDown}
          anchorOrigin={{
            vertical: "bottom",
            horizontal: "right",
          }}
        >
          <MenuItem> Filters </MenuItem>
          <hr></hr>

          <MenuItem> Status </MenuItem>
          <MenuItem onClick={() => setStat("All")}>
            <Checkbox checked={stat === "All"} />
            All
          </MenuItem>
          <MenuItem onClick={() => setStat("CLEAR")}>
            <Checkbox checked={stat === "CLEAR"} />
            Clear
          </MenuItem>
          <MenuItem onClick={() => setStat("CONSIDER")}>
            <Checkbox checked={stat === "CONSIDER"} />
            Consider
          </MenuItem>
          <MenuItem> Ajudication </MenuItem>
          <MenuItem onClick={() => setStat("All2")}>
            <Checkbox checked={stat === "All2"} />
            All
          </MenuItem>
          <MenuItem onClick={() => setStat("Engaged")}>
            <Checkbox checked={stat === "Engaged"} />
            Engaged
          </MenuItem>
          <MenuItem onClick={() => setStat("Pre Adverse Action")}>
            <Checkbox checked={stat === "Pre Adverse Action"} />
            Pre Adverse Action
          </MenuItem>
        </Menu>
      </div>
      <Paper sx={{ width: "100%", overflow: "hidden" }}>
        <TableContainer component={Paper}>
          <Table sx={{ minWidth: 650 }} aria-label="simple table">
            <TableHead>
              <TableRow>
                <TableCell>Name</TableCell>
                <TableCell align="right">Adjudiction</TableCell>
                <TableCell align="right">Status</TableCell>
                <TableCell align="right">Location</TableCell>
                <TableCell align="right">Date </TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {filteredData.map((row) => (
                <TableRow
                  key={row.name}
                  sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
                >
                  <TableCell component="th" scope="row">
                    {row.name}
                  </TableCell>
                  <TableCell align="right" sx={{ color: "ForestGreen" }}>
                    {row.adjudiction}
                  </TableCell>
                  <TableCell align="right" sx={{ color: "ForestGreen" }}>
                    {row.status}
                  </TableCell>
                  <TableCell align="right">{row.location}</TableCell>
                  <TableCell align="right">{row.date}</TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
        <TablePagination
          rowsPerPageOptions={[10, 25, 100]}
          component="div"
          count={rows.length}
          rowsPerPage={rowsPerPage}
          page={page}
          onPageChange={handleChangePage}
          onRowsPerPageChange={handleChangeRowsPerPage}
        />
      </Paper>
    </div>
  );
}
function setFilteredData(arg0: any) {
  throw new Error("Function not implemented.");
}
