
                                       ** Table for rules of the access specifier **

+ --> accessible

                | Class    |  Package    | Subclass(same pkg) | Subclass(diff pkg) | World (diff pkg & not subclass |
  ---------------------------------------------------------------------------------------------------------------------
   private      |    +     |             |                    |                    |                                |
  --------------------------------------------------------------------------------------------------------------------
   no modifier  |     +    |     +       |       +            |                    |                                |
  ---------------------------------------------------------------------------------------------------------------------
   protected    |     +    |       +     |        +           |         +          |                                |
  ---------------------------------------------------------------------------------------------------------------------
   public       |    +     |     +       |         +          |        +           |             +                  |
  ----------------------------------------------------------------------------------------------------------------------

uses of access modifier :

private : it is used to hide sensitive data that should not be accessed directly..

no modifier (default) : it is used when the data should not be accessed outside the package..

protected : if the data should be only accessed by the subclass of different package we use this modifier.

public : if the data should be accessible everywhere, we use this. (this is very dangerous use it carefully).
