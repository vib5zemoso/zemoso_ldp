// search Table List
function searchTable() {
    let filter = document.getElementById("search-table").value.toUpperCase();

    const tables = document.getElementsByClassName("table");

    for (let i = 0; i < tables.length; i++) {
        let temp = tables[i].getElementsByTagName("h2")[0];
        let content = temp.textContent;
        if (content.toUpperCase().indexOf(filter) > -1) {
            tables[i].style.display = "";
        } else {
            tables[i].style.display = "none";
        }
    }
}

// functionality for dragging and dropping
function drag(event) {
    event.dataTransfer.setData("text", event.target.id);
}

function onDragOver(event) {
    event.preventDefault();
}

function onDrop(event, tableNumber) {
    const targetId = event.dataTransfer.getData("text");

    if (tableNumber === 1) {
        if (!localStorage.getItem("table1")) {
            localStorage.setItem("table1", '[]');
        }
        let oldData = JSON.parse(localStorage.getItem("table1"));
        for (let i = 0; i < oldData.length; i++) {
            if (oldData[i].name === menuItems[targetId].name) {
                oldData[i].quantity = parseInt(oldData[i].quantity) + 1;
                localStorage.setItem("table1", JSON.stringify(oldData));
                window.location.reload();
                return;
            }
        }
        oldData.push(menuItems[targetId]);
        localStorage.setItem("table1", JSON.stringify(oldData));
    } else if (tableNumber === 2) {
        if (!localStorage.getItem("table2")) {
            localStorage.setItem("table2", '[]');
        }
        let oldData = JSON.parse(localStorage.getItem("table2"));
        for (let i = 0; i < oldData.length; i++) {
            if (oldData[i].name === menuItems[targetId].name) {
                oldData[i].quantity = parseInt(oldData[i].quantity) + 1;
                localStorage.setItem("table2", JSON.stringify(oldData));
                window.location.reload();
                return;
            }
        }
        oldData.push(menuItems[targetId]);
        localStorage.setItem("table2", JSON.stringify(oldData));
    } else if (tableNumber === 3) {
        if (!localStorage.getItem("table3")) {
            localStorage.setItem("table3", '[]');
        }
        let oldData = JSON.parse(localStorage.getItem("table3"));
        for (let i = 0; i < oldData.length; i++) {
            if (oldData[i].name === menuItems[targetId].name) {
                oldData[i].quantity = parseInt(oldData[i].quantity) + 1;
                localStorage.setItem("table3", JSON.stringify(oldData));
                window.location.reload();
                return;
            }
        }
        oldData.push(menuItems[targetId]);
        localStorage.setItem("table3", JSON.stringify(oldData));
    } else if (tableNumber === 4) {
        if (!localStorage.getItem("table4")) {
            localStorage.setItem("table4", '[]');
        }
        let oldData = JSON.parse(localStorage.getItem("table4"));
        for (let i = 0; i < oldData.length; i++) {
            if (oldData[i].name === menuItems[targetId].name) {
                oldData[i].quantity = parseInt(oldData[i].quantity) + 1;
                localStorage.setItem("table4", JSON.stringify(oldData));
                window.location.reload();
                return;
            }
        }
        oldData.push(menuItems[targetId]);
        localStorage.setItem("table4", JSON.stringify(oldData));
    }
}

// open specific modal when clicked
function openModal(tableNumber){
    document.getElementById("table-num").innerHTML = "Table " + tableNumber + " ";

    let modal = document.getElementById("myModal");

    let span = document.getElementsByClassName("close")[0];

    modal.style.display = "block";

    const closeBill = document.getElementsByClassName('close-bill')[0];
    closeBill.setAttribute("id",tableNumber);
    closeBill.setAttribute("onclick","generateBill(event)");
    closeBill.style.cursor = "pointer";
    closeBill.style.textAlign = "right";
    console.log(closeBill);

    display(tableNumber);

    span.onclick = function() {
        modal.style.display = "none";
        window.location.reload();
    }

    window.onclick = function(event) {
        if (event.target == modal) {
             modal.style.display = "none";
             window.location.reload();
        }
       
    }
}

// displays the menu items ordered at specific table
function display(tableNumber) {
    let totalPrice = 0;
    let arr = [];

    let tableName = "table" + tableNumber;
    const tbody = document.getElementsByTagName("tbody");
    let j = 1;
    if (!localStorage.getItem(tableName)) {
        window.location.reload();
    }
    data = JSON.parse(localStorage.getItem(tableName));
    for (let obj of data) {
        var inputNumber = document.createElement("input");
        inputNumber.setAttribute("type", "number");
        inputNumber.setAttribute("class", "quantity");
        inputNumber.setAttribute("min", 1);
        inputNumber.setAttribute("id", "" + tableNumber + j);
        inputNumber.setAttribute("oninput", "updateQuantity(event)");


        const node = document.getElementById("row");
        const clone = node.cloneNode(true);
        clone.childNodes[1].textContent = j++;
        clone.childNodes[3].textContent = obj.name;
        clone.childNodes[5].textContent = obj.price;
        clone.childNodes[7].appendChild(inputNumber);
        clone.childNodes[9].childNodes[0].setAttribute("id", "" + tableNumber + (j - 1));
        clone.childNodes[9].childNodes[0].setAttribute("onclick", "deleteItem(event)");

        tbody[0].appendChild(clone);
        arr.push(obj.quantity);
        totalPrice = totalPrice + obj.quantity * obj.price;

        document.getElementById("total").innerHTML = `Total Price: ${totalPrice}`;
    }
    const inputArray = document.getElementsByClassName("quantity");
    for (let k = 0; k < inputArray.length; k++) {
        inputArray[k].value = arr[k];
    }

}

// closes the session and generate the bill 
function generateBill(event) {
    const table = event.target.id;
    const tableName = "table" + table;
    const data = JSON.parse(localStorage.getItem(tableName));
    let totalPrice = 0;
    console.log("Item\tPrice\tQuantity\tTotal");
    let displayAlert = "Item - Price - Quantity - Total\n";
    for (let item of data) {
        totalPrice = totalPrice + item.price * item.quantity;
        console.log(item.name + "\t" + item.price + "\t" + item.quantity + "\t" + (item.price * item.quantity));
        displayAlert = displayAlert + item.name + " - " + item.price + " - " + item.quantity + " - " + (item.price * item.quantity) + "\n";
    }
    console.log("Total Price:\t" + totalPrice);
    localStorage.removeItem(tableName);
    displayAlert = displayAlert + "Total Price: " + totalPrice + "\n";
    alert(displayAlert);
    window.location.reload();
}

// deleting the item from the list
function deleteItem(event) {
    const table = event.target.id[0];
    const item = event.target.id[1];

    if (table == 1) {
        const data = JSON.parse(localStorage.table1);
        const index = data.indexOf(data[item - 1]);
        if (index > -1) {
            data.splice(index, 1);
        }
        localStorage.setItem("table1", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table1.totalPrice();

    } else if (table == 2) {
        const data = JSON.parse(localStorage.table2);
        const index = data.indexOf(data[item - 1]);
        if (index > -1) {
            data.splice(index, 1);
        }
        localStorage.setItem("table2", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table1.totalPrice();

    } else if (table == 3) {
        const data = JSON.parse(localStorage.table3);
        const index = data.indexOf(data[item - 1]);
        if (index > -1) {
            data.splice(index, 1);
        }
        localStorage.setItem("table3", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table1.totalPrice();

    } else if (table == 4) {
        const data = JSON.parse(localStorage.table4);
        const index = data.indexOf(data[item - 1]);
        if (index > -1) {
            data.splice(index, 1);
        }
        localStorage.setItem("table4", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table1.totalPrice();

    }

    window.location.reload();
}

// updating the quantity of an item at particular table
function updateQuantity(event) {
    const num = event.target.id[1];

    if (event.target.id[0] == 1) {
        const data = JSON.parse(localStorage.table1);
        data[num - 1].quantity = event.target.value;
        localStorage.setItem("table1", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table1.totalPrice();
    } 
    else if (event.target.id[0] == 2) {
        const data = JSON.parse(localStorage.table2);
        data[num - 1].quantity = event.target.value;
        localStorage.setItem("table2", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table2.totalPrice();
    } 
    else if (event.target.id[0] == 3) {
        const data = JSON.parse(localStorage.table3);
        data[num - 1].quantity = event.target.value;
        localStorage.setItem("table3", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table3.totalPrice();
    } 
    else if (event.target.id[0] == 4) {
        const data = JSON.parse(localStorage.table4);
        data[num - 1].quantity = event.target.value;
        localStorage.setItem("table4", JSON.stringify(data));
        document.getElementById("total").innerHTML = "Total Rs: " + tableData.table4.totalPrice();
    }
}

