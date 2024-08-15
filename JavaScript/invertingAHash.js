function invertHash(hash) {
  let newHash = {};

  for (const key in hash) {
    const value = hash[key];
    newHash[value] = key;
  }
  return newHash;
}

console.log(invertHash({ a: "1", b: "2", c: "3" }));
