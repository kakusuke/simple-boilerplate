select /*%expand*/* from employee order by
/*%for name : values*/
name <> /*name*/'a'/*%if name_has_next*//*#","*//*%end*/
/*%end*/