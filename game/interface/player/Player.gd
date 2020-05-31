extends KinematicBody2D

var motion = Vector2(0,0)
const SPEED = 1500
const GRAVITY = 500
const UP = Vector2(0,-1)
const JUMP_SPEED = 3000
const WORLD_LIMIT = 4000



func _physics_process(delta):
	apply_gravity()
	jump()
	move()
	move_and_slide(motion,UP)
	
func apply_gravity():
	if position.y > WORLD_LIMIT:
		PlayerLife.life -= 1
		get_tree().change_scene("res://interface/levels/Level1.tscn")
		if(PlayerLife.life  == 0):
			end_game()
		
	if is_on_floor():
		motion.y = 0
	else:
		motion.y += GRAVITY
	
func move():
	if Input.is_action_just_pressed("left") and not Input.is_action_pressed("right"):
		motion.x = -SPEED
	elif Input.is_action_just_pressed("right") and not Input.is_action_pressed("left"):
		motion.x = SPEED
	else:
		motion.x=0
		
func jump():
	if Input.is_action_just_released("jump") and is_on_floor():
		motion.y -= JUMP_SPEED

func end_game():
	PlayerLife.life = 3
	get_tree().change_scene("res://interface/levels/GameOver.tscn")

	
