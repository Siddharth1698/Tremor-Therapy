extends Control

var filenameq = "steady.json"
func get_from_json(filenameq):  
	var file = File.new()  
	file.open(filenameq, File.Read)  
	var text= file.get_as_text()  
	var data= parse_json(text)  
	file.close()  
	print(text)

