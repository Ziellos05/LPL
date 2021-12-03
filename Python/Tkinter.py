import tkinter


def accion(mensaje):
    global boton_text
    text = textbox.get()
    textbox.delete(0, 'end')
    text_label.config(text=text)
    title_label.config(text=mensaje)
    if boton_text == "Boton de amor":
        boton_text = "Ahora amas a Maria"
    else:
        boton_text = "Boton de amor"
    boton.config(text=boton_text)

azar='Es lindo haberte conocido en esta vidita UwU'

main_window = tkinter.Tk()

main_frame = tkinter.Frame(main_window, bg='navajo white', height=500, width=500, cursor='heart', padx=50, pady=50)
main_frame.pack()

title_label = tkinter.Label(main_frame, text="Maria, te amo", font=('Arial',11), fg='maroon')
title_label.pack()

body_label1 = tkinter.Label(main_frame, text="Mira, aprendi a programar interfaces graficas")
body_label1.pack()

boton_text="Boton de amor"
boton = tkinter.Button(main_frame, text=boton_text, command=lambda:accion(azar))
boton.pack()

textbox = tkinter.Entry(main_frame)
textbox.pack()
text_label = tkinter.Label(main_frame, justify='left')
text_label.pack()

imagen = tkinter.PhotoImage(file='indice.png')
body_label2 = tkinter.Label(main_frame, image=imagen)
body_label2.pack()

main_window.mainloop()