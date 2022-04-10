const a = 5; // const 변하지 않는 상수 값
const b = 2;
let myName = "hyuntober";

console.log(a + b);
console.log(a * b);
console.log(a / b);
console.log("hello, " + myName + "!");

myName = "hyunji";

console.log("your new name is " + myName);

// 변수
// 변수를 사용하는 이유는
// 계산을 사용할 때 다양하게 쓰인다면
// 변경할 경우 일일이 다 변경해야하지만 변수로 일단 쓰이면 수정할 때 한번만 쓰인다

const amIFat = null; // 이 변수에 아무것도 없다는 뜻
const amIFat = "true"; // 이 변수는 문자열.
const amIFat = true; // 이 변수는 boolean 참거짓.
console.log(amIFat);

