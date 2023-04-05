const tableData = {
    table1: {
        totalItems: () => {
            if (!localStorage.getItem("table1")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table1"));
            return data.length;
        },
        totalPrice: () => {
            if (!localStorage.getItem("table1")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table1"));
            let price = 0;
            for (let obj of data) {
                price = price + obj.price * obj.quantity;
            }
            return price;
        },
    },
    table2: {
        totalItems: () => {
            if (!localStorage.getItem("table2")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table2"));
            return data.length;
        },
        totalPrice: () => {
            if (!localStorage.getItem("table2")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table2"));
            let price = 0;
            for (let obj of data) {
                price = price + obj.price * obj.quantity;
            }
            return price;
        },
    },
    table3: {
        totalItems: () => {
            if (!localStorage.getItem("table3")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table3"));
            return data.length;
        },
        totalPrice: () => {
            if (!localStorage.getItem("table3")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table3"));
            let price = 0;
            for (let obj of data) {
                price = price + obj.price * obj.quantity;
            }
            return price;
        },
    },
    table4: {
        totalItems: () => {
            if (!localStorage.getItem("table4")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table4"));
            return data.length;
        },
        totalPrice: () => {
            if (!localStorage.getItem("table4")) {
                return 0;
            }
            const data = JSON.parse(localStorage.getItem("table4"));
            let price = 0;
            for (let obj of data) {
                price = price + obj.price * obj.quantity;
            }
            return price;
        },
    },
}

document.getElementById("table1").innerHTML = `Rs: ${tableData.table1.totalPrice()} | ${tableData.table1.totalItems()} items`;
document.getElementById("table2").innerHTML = `Rs: ${tableData.table2.totalPrice()} | ${tableData.table2.totalItems()} items`;
document.getElementById("table3").innerHTML = `Rs: ${tableData.table3.totalPrice()} | ${tableData.table3.totalItems()} items`;
document.getElementById("table4").innerHTML = `Rs: ${tableData.table4.totalPrice()} | ${tableData.table4.totalItems()} items`;

