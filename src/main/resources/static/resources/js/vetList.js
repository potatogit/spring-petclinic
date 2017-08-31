function onTestRequest () {
    console.log('hello on test request');
    var testJson = {
        "intClass": 1
        // "trueInt": 2,
        // "str": "potato"
    };

    console.log(testJson);

    $.ajax("test", {
        dataType: "json",
        method: "POST",
        data: testJson,
        contentType: "application/json"
    });
}
