const imagename = ["adj_1", "adj_2"];


const image = new Array();

for (let i = 0; i < imagename.length; i++) {
	image[i] = imagename[i] + ".jpg";
	console.log(image[i]);
}

let count = 1;
function showDefaultRotate() {
	console.log(count);
	document.querySelector(".adjimage").setAttribute("src", "/resources/image/" + image[count]);
	count = ++count >= image.length ? 0 : count;
}

window.onload = () => {
	setInterval(showDefaultRotate, 2000);
} 