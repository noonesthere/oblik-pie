import {
  NavigationMenu,
  NavigationMenuContent,
  NavigationMenuItem,
  NavigationMenuLink,
  NavigationMenuList,
  NavigationMenuTrigger,
} from "@/components/ui/navigation-menu"
import Link from "next/link";
import {cn} from "@/lib/utils";

export default function NavBar() {
  return <NavigationMenu className="bg-blue-400">
    <NavigationMenuList>

      <NavigationMenuItem  >
        <NavigationMenuLink asChild className="menu-item">
          <Link href="/protocols">Protocols</Link>
        </NavigationMenuLink>
      </NavigationMenuItem>

      <NavigationMenuItem  >
        <NavigationMenuLink asChild className="menu-item">
          <Link href="/">Search</Link>
        </NavigationMenuLink>
      </NavigationMenuItem>

      <NavigationMenuItem  >
        <NavigationMenuLink asChild className="menu-item">
          <Link href="/reasons">Reasons</Link>
        </NavigationMenuLink>
      </NavigationMenuItem>

      <NavigationMenuItem  >
        <NavigationMenuLink asChild className="menu-item">
          <Link href="/config">Config</Link>
        </NavigationMenuLink>
      </NavigationMenuItem>
    </NavigationMenuList>
  </NavigationMenu>
}
