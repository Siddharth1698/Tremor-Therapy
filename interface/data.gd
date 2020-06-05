extends Node


func get_from_json(filename):  
	var file = File.new()  
	file.open("res://data/steady.json", File.Read)  
	var text= file.get_as_text()  
	var data= parse_json(text)  
	file.close()  
	print(text)

