var netInfo = require('com.clever_apps.tinetworkinfo');

var win = Ti.UI.createWindow({exitOnClose: true});

var testLabel = Ti.UI.createLabel({
	height:"80%",
	width:"90%",
	top:0
});

var refreshButton = Ti.UI.createButton({
	title:"Refresh Data",
	height:"15%",
	bottom:"5%"
});
refreshButton.addEventListener("click", getTelephonyData);

win.add(testLabel);
win.add(refreshButton);
getTelephonyData();
win.open();


function getTelephonyData(){
	var imei = netInfo.getIMEI();
	var cellid = netInfo.getCellID();
	var lac = netInfo.getLac();
	var mnc = netInfo.getMNC();
	var mmc = netInfo.getMMC();
	
	
	var outString = "IMEI: "+imei+"\nCell ID: "+cellid+"\nLAC: "+lac+"\nMNC: "+mnc+"\nMMC: "+mmc;
	testLabel.text = outString;
}
