const container = document.querySelector('#container');

const content = document.createElement('div');
content.classList.add('content');
content.textContent = 'This is the glorious text-content!';

container.appendChild(content);

const content2 = document.createElement('p');
content2.classList.add('content2');
content2.textContent = "Hey I'm red!";
content2.style.color = 'red';
container.appendChild(content2);

const content3 = document.createElement('h3');
content3.classList.add('content3');
content3.textContent = "I'm a blue h3!";
content3.style.color = 'blue';
container.appendChild(content3);

const division = document.createElement('div');
division.classList.add('division');
division.style.border = '1px solid black';
division.style.backgroundColor = 'pink';
container.appendChild(division);


const content4 = document.createElement('h1');
content4.classList.add('content4');
content4.textContent = "I'm in a div";
division.appendChild(content4);

const content5 = document.createElement('p');
content5.classList.add('content5');
content5.textContent = "ME TOO!";
division.appendChild(content5);
