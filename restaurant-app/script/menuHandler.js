// Display the menu items
let menuId = 0;
const menuList = document.getElementsByClassName("menu-list");
for (var obj of menuItems) {
    const node = document.getElementsByClassName("menu")[0];
    const clone = node.cloneNode(true);
    clone.childNodes[1].textContent = obj.name;
    clone.childNodes[3].textContent = obj.course;
    clone.childNodes[6].textContent = `Rs: ${obj.price}`;
    clone.setAttribute("id", menuId++);

    menuList[0].appendChild(clone);
}
menuList[0].children[0].style.display = "none";


// search Menu List
function searchMenu() {
    const searchInput = document.getElementById("search-menu");
    let filterValue = searchInput.value.toUpperCase();
    for (let i = 0; i < menuItems.length; i++) {
        if ((menuItems[i].course.toUpperCase().indexOf(filterValue) > -1) || menuItems[i].name.toUpperCase().indexOf(filterValue) > -1) {
            document.getElementById(i).style.display = "";
        } else {
            document.getElementById(i).style.display = "none";
        }
    }
}

