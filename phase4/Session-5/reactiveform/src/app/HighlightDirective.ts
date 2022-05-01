import { Directive, ElementRef, Renderer2 } from "@angular/core";
@Directive({
    selector:'[app]' //directive selector
})
export class ChangeColorDirective{
    constructor(elemref:ElementRef,render:Renderer2)
    {
        render.setStyle(elemref.nativeElement,'color','red');
    }
}