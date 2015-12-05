var ws = new WebSocket("ws://localhost:8080/stocks");

// Called when the socket connection established
ws.onopen = function() {
	appendLog("Connected to stock service! Pres 'Start' to get stock info.");
};

// Called when a message is received from the server
ws.onmessage = function (event) {
	appendLog(event.data);
};

ws.onclose = function() {
	appendLog("Disconnected from Web Service");
};

ws.onerror = function(error) {
	console.log("There was an error: " + error);
};

// appends logText to log text area
function appendLog(log) {
	var log = document.getElementById("log");
	log.value = log.value + logText + "\n";
}

// sends msg to the server over websocket
function sendToServer(message) {
	ws.send(message);
}

