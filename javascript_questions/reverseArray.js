function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = words.map(word => reverseWord(word));
    return reversedWords.join(' ');
}

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
