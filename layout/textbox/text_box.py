import customtkinter as c
janela=c.CTk()

janela.title('Working whith a new TextBox')
janela.geometry('700x400')
janela.resizable(False,False)

textbox=c.CTkTextbox(
        janela,
        width=320,
        height=350,
        corner_radius=10,
        scrollbar_button_color='gray',
        scrollbar_button_hover_color='black',
        border_width=2,
        border_color='black',
        fg_color='snow',
        border_spacing=20,
        activate_scrollbars=True # or False
)
textbox.pack(padx=10,pady=10)
textbox.insert('0.0','Agora tem como ver\n\n' +'como é criar uma caixa de texto com textos aleatórios.\n\n'*30)

janela.mainloop()